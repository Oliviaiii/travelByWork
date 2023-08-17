/**
 * 
 */
function storework(event){
    console.log("test");
    event.preventDefault();
    const storeworklist = {};
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
        url: "storeAccount2",
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


//oliii
$(document).ready(function() {
    // Get postJob data from the backend
    $.ajax({
        url: '/getPostJobs',
        type: 'GET',
        dataType: 'json',
        success: function(data) {
            console.log(data);
            var shareDataBody = $('#shareDataBody');
            shareDataBody.empty(); // Clear existing data

            data.forEach(function(postJob) { // Change 'share' to 'postJob'
                var row = $('<tr>');
                row.append($('<td>').text(postJob.storename));
                row.append($('<td>').text(postJob.location));
                row.append($('<td>').text(postJob.workage));
                row.append($('<td>').text(postJob.worksexual));
                row.append($('<td>').text(postJob.changedatebegin + ' 到 ' + postJob.changedateeend));
                row.append($('<td>').text(postJob.aleastdays));
                row.append($('<td>').text(postJob.breaktime));
                row.append($('<td>').text(postJob.workhours));
                row.append($('<td>').text(postJob.atwhattime));
                row.append($('<td>').text(postJob.scooters));
                row.append($('<td>').text(postJob.meals));
                row.append($('<td>').text(postJob.money));

                // 添加 "聯絡方式內容" 按鈕
                console.log(postJob);
                var callButton = $('<button>').addClass('callButton').text('查看聯絡方式');
                callButton.data('postJob', postJob); // 直接將整個 postJob 物件存儲在 data 屬性中
                row.append($('<td>').append(callButton));

                // 添加 "留言" 按鈕
                var commentButton = $('<button>').addClass('commentButton').text('留言');
                commentButton.data('postJob-id', postJob.postJobId); // 假設每個 postJob 都有 postJobId
                row.append($('<td>').append(commentButton));

                shareDataBody.append(row);
            });

            // 使用事件代理處理動態生成的 "聯絡方式內容" 按鈕
            $(document).on('click', '.callButton', function() {
                var postJob = $(this).data('postJob'); // 直接使用整個 postJob 物件
				var callContent = "Email: " + postJob.email + "<br>" +
                  "手機: " + postJob.phone + "<br>" +
                  "行動電話: " + postJob.mobile + "<br>" +
                  "地址: " + postJob.address;
                $('#callDialog').html(callContent).dialog({
                    modal: true,
                    title: '聯絡方式',
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
