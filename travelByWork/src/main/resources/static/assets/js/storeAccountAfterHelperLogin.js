function storework(event){
    
    event.preventDefault();
    const storeworklist = {};
	storeworklist.storememberid = $("#memberIdWorkList").val();
    storeworklist.storeName = $("#storenameWorkList").val();
    storeworklist.ownerName = $("#ownernameWorkList").val();
    storeworklist.email = $("#emailWorkList").val();
    storeworklist.mobile = $("#mobileWorkList").val();
    storeworklist.phone = $("#phoneWorkList").val();
    storeworklist.address = $("#addressWorkList").val();
    storeworklist.location = $("#location").val();
    //storeworklist.workupdatetime = $("#workupdatetime").val();
    storeworklist.workage = $("#workage").val();
    storeworklist.worksexual = $("#worksexual").val();
    storeworklist.howtoapply = $("#howtoapply").val();
    storeworklist.others = $("#others").val();
    storeworklist.changedatebegin = $("#changedatebegin").val();
    storeworklist.changedateeend = $("#changedateeend").val();
    storeworklist.aleastdays = $("#aleastdays").val();
    storeworklist.breaktime = $("#breaktime").val();
    storeworklist.workhours = $("#workhours").val();
    storeworklist.atwhattime = $("#atwhattime").val();
    storeworklist.workdetails = $("#workdetails").val();
    storeworklist.scooters = $("#scooters").val();
    storeworklist.meals = $("#meals").val();
    storeworklist.money = $("#money").val();
    storeworklist.workbonus = $("#workbonus").val();
    $.ajax({
        url: "createStoreWork",
        type: "post",
        dataType: "text",
        contentType: "Application/json",
        data: JSON.stringify(storeworklist),
        success: result,
        error: function(myerror) {
            console.log(myerror);
        }
    });
}

function result(data){
    if(data === "新增成功"){
        window.location.href = "/postJob";
    } else {
        alert(data);
    }
}

$("#storeworkListForm").submit(storework);


function setSession(data){
	document.getElementById('helpermemberid').value=data.helperMember.helpermemberid;
}

//oliii
$(document).ready(function() {
	//取得小幫手資料
		$.ajax({
			url: '/getGoogleSession',
			type: 'get',
			datatype: 'json',
			success:setSession
	    });
     	$.ajax({
			url: '/getSession',
			type: 'get',
			datatype: 'json',
			success:setSession
		});
    // Get postJob data from the backend
    $.ajax({
        url: '/getPostJobs',
        type: 'GET',
        dataType: 'json',
        success: function(data) {
            var shareDataBody = $('#shareDataBody');
            shareDataBody.empty(); 

            data.forEach(function(postJob) { 
                var row = $('<tr>');
                row.append($('<td>').text(postJob.storeName));
                row.append($('<td>').text(postJob.location));
                
                //取得店家被收藏數量
                $.ajax({
					url: '/getJobByWorkListIdSize/'+postJob.storeworklistid,
					type: 'get',
					datatype: 'json',
					success:function(data){
						row.append($('<td>').text(data));
					}
				});
                                
                
                // 添加 "其他條件備註" 按鈕
                var needButton = $('<button>').addClass('needButton').text('其他條件');
                needButton.data('postJob', postJob); // 直接將整個 postJob 物件存儲在 data 屬性中
                row.append($('<td>').append(needButton));                
                row.append($('<td>').text(postJob.changedatebegin + ' 到 ' + postJob.changedateeend));
                
                // 添加 "工作時間" 按鈕
                var timeButton = $('<button>').addClass('timeButton').text('內容');
                timeButton.data('postJob', postJob); // 直接將整個 postJob 物件存儲在 data 屬性中
                row.append($('<td>').append(timeButton));
                
                
                // 添加 "福利" 按鈕
                var bonusButton = $('<button>').addClass('bonusButton').text('福利');
                bonusButton.data('postJob', postJob); // 直接將整個 postJob 物件存儲在 data 屬性中
                row.append($('<td>').append(bonusButton));

                // 添加 "聯絡方式內容" 按鈕
                var callButton = $('<button>').addClass('callButton').text('聯絡方式');
                callButton.data('postJob', postJob); // 直接將整個 postJob 物件存儲在 data 屬性中
                row.append($('<td>').append(callButton));
                
				
                // 添加 "收藏" 按鈕
                var commentButton = $('<button>').addClass('commentButton').text('收藏');
                commentButton.data('storeworklistid', postJob.storeworklistid); 
                row.append($('<td>').append(commentButton));

                shareDataBody.append(row);
            });
            
            
            // 收藏
            $(document).on('click', '.commentButton', function() {
				var storeworklistid = $(this).data('storeworklistid');                
                var helpermemberid=$("#helpermemberid").val(); 
                var helperJob={};
                helperJob.storeworklistid=storeworklistid;
                helperJob.helpermemberid=helpermemberid;
                helperJob.favorite=true;
                
				if(helpermemberid===""){
					alert("請先登入");
				}else{
					$.ajax({
						url: 'addHelperJob',					
				        type: 'post',
				        dataType: 'text',  					
				        contentType: 'application/json', 	    
				        data: JSON.stringify(helperJob),								
				        success: function(data){alert(data);},					 
				        error: function (myerror) { console.log(myerror) ;}
					});
				}
            });


            // 使用事件代理處理動態生成的 "聯絡方式內容" 按鈕
            $(document).on('click', '.callButton', function() {
                var postJob = $(this).data('postJob'); // 直接使用整個 postJob 物件
                          
				var callContent = "Email: " + postJob.email + "<br>" +
                  "手機: " + postJob.phone + "<br>" +
                  "行動電話: " + postJob.mobile + "<br>" +
                  "地址: " + postJob.address +"<br>" +
                  "如何申請比較好？: " + postJob.howtoapply;
                $('#callDialog').html(callContent).dialog({
                    modal: true,
                    title: '聯絡方式',
                    width: 700,   // 寬度
                    height: 600,  // 高度
                    buttons: {
                        '關閉': function() {
                            $(this).dialog('close');
                        }
                    }
                });

			//google地圖功能
				let latitude;//經度
				let longitude//緯度
				if (!window.google || !google.maps) {
                	(g=>{var h,a,k,p="The Google Maps JavaScript API",c="google",l="importLibrary",q="__ib__",m=document,b=window;b=b[c]||(b[c]={});var d=b.maps||(b.maps={}),r=new Set,e=new URLSearchParams,u=()=>h||(h=new Promise(async(f,n)=>{await (a=m.createElement("script"));e.set("libraries",[...r]+"");for(k in g)e.set(k.replace(/[A-Z]/g,t=>"_"+t[0].toLowerCase()),g[k]);e.set("callback",c+".maps."+q);a.src=`https://maps.${c}apis.com/maps/api/js?`+e;d[q]=f;a.onerror=()=>h=n(Error(p+" could not load."));a.nonce=m.querySelector("script[nonce]")?.nonce||"";m.head.append(a)}));d[l]?console.warn(p+" only loads once. Ignoring:",g):d[l]=(f,...n)=>r.add(f)&&u().then(()=>d[l](f,...n))})
        			({key: "AIzaSyAi1TkhF8hAg5Qw60B3f2rkckWTfUvh0cw", v: "beta"});//key： google金鑰
        			getLocation();//下方函式
				} else {
				  	getLocation();
				}

				function getLocation(){			//從資料庫(address)取得經緯度
					 const apiKey = 'AIzaSyAi1TkhF8hAg5Qw60B3f2rkckWTfUvh0cw';
					 const address = postJob.address;	

			
					 fetch(`https://maps.googleapis.com/maps/api/geocode/json?address=${encodeURIComponent(address)}&key=${apiKey}`)
					   .then(response => response.json())
					   .then(data => {
					       const location = data.results[0].geometry.location;
					       latitude = location.lat;
					       longitude = location.lng;
					       console.log(`緯度：${latitude}, 經度：${longitude}`);
					       initMap();
					   });
				}
					  
		        async function initMap() { 		//抓地圖函式
		            const position = { lat: latitude , lng:longitude };
		            const { Map } = await google.maps.importLibrary("maps");
		            const { AdvancedMarkerView } = await google.maps.importLibrary("marker");
		            let map = new Map(document.getElementById("mymap"), {
		            zoom: 18,
		            center: position,
		            mapId: "DEMO_MAP_ID",
		            });
		            const marker = new AdvancedMarkerView({
		            map: map,
		            position: position,
		            title: "StoreAddress",
		            });
		        }
				var mapContainer = document.createElement("div");	//新增div標籤
			    mapContainer.id = "mymap";	
			    mapContainer.style.overflow= "visible";				//處理畫面超出範圍
			    mapContainer.style.height = "400px";
			    mapContainer.style.width = "80%";
			    document.getElementById("callDialog").appendChild(mapContainer);   
            });
 

            // 使用事件代理處理動態生成的 "工作內容時間" 按鈕
            $(document).on('click', '.timeButton', function() {
                var postJob = $(this).data('postJob'); // 直接使用整個 postJob 物件
				var timeContent = "換宿最短時間: " + postJob.aleastdays + "<br>"+
					"週休日: " + postJob.breaktime + "<br>" +
                  	"工作時間: " + postJob.workhours + "<br>" +
                  	"工作班別: " + postJob.atwhattime + "<br>" +
                    "工作內容: " + postJob.workdetails;
                $('#timeDialog').html(timeContent).dialog({
                    modal: true,
                    title: '工作內容',
                    width: 500,   // 寬度為500像素
                    height: 400,  // 高度為400像素
                    buttons: {
                        '關閉': function() {
                            $(this).dialog('close');
                        }
                    }
                });
            });
            
             // 使用事件代理處理動態生成的 "其他備註條件" 按鈕
            $(document).on('click', '.needButton', function() {
                var postJob = $(this).data('postJob'); // 直接使用整個 postJob 物件
				var needContent = "需求年齡: " + postJob.workage+ "<br>"+
                "需求性別: " + postJob.worksexual+ "<br>"+
                "其他條件＆備註: " + postJob.others+ "<br>";
                $('#callDialog').html(needContent).dialog({
                    modal: true,
                    title: '其他條件＆備註',
                    width: 500,   // 寬度為500像素
                    height: 400,  // 高度為400像素
                    buttons: {
                        '關閉': function() {
                            $(this).dialog('close');
                        }
                    }
                });
            });
            
            
            
             // 使用事件代理處理動態生成的 "福利" 按鈕
            $(document).on('click', '.bonusButton', function() {
                var postJob = $(this).data('postJob'); // 直接使用整個 postJob 物件
				var conusContent = "交通工具: " + postJob.scooters + "<br>"+
                "供餐: " + postJob.meals + "<br>"+
                "零用金: " + postJob.money + "<br>"+
                "其餘福利: " + postJob.workbonus;
                $('#bonusDialog').html(conusContent).dialog({
                    modal: true,
                    title: '福利內容',
                    width: 500,   // 寬度為500像素
                    height: 400,  // 高度為400像素
                    buttons: {
                        '關閉': function() {
                            $(this).dialog('close');
                        }
                    }
                });
            });
            
        },
        error: function(error) {
            console.log('Error fetching postJob data:', error);
        }
    });
});

$(document).ready(function() {
    // 觸發按鈕
    $("#yourButtonID").click(function() {
        // 顯示隐藏的 div 元素
        $("#callDialog, #timeDialog, #needDialog, #workDetailDialog, #bonusDialog").css("display", "block");
    });
});


