
 
function addHelperShare(event){
	event.preventDefault();
    const helpershare = {};
	//helpershare.helpershareid = $("#helpershareid").val();
	helpershare.helpmemberid = $("#helpmemberid").val();
    helpershare.account = $("#accout").val();
    helpershare.username = $("#username").val();
    helpershare.startdate = $("#startdate").val();
    helpershare.enddate = $("#enddate").val();
    helpershare.place = $("#place").val();
    helpershare.storename = $("input[name='storename']").val();
    helpershare.worktype = $("#worktype").val();
  	helpershare.workdetail = $("textarea[name='workdetail']").val();
    helpershare.grade = $("#grade").val();
    helpershare.content = $("textarea[name='content']").val();
    helpershare.updatedate = $("#updatedate").val();
                 
   $.ajax({
        url: '/addshare',
        type: 'post',
        dataType: 'text',
        contentType: 'application/json',     
        data: JSON.stringify(helpershare),					
        success: result, 
        error: function (myerror) { console.log(myerror) ;}
    });
}

function result(data){
    if (data === "心得新增成功") {
        window.location.href = "/share"; 
    } else {
        alert(data); 
    }
  }


$("#addShareForm").submit(addHelperShare);

$(document).ready(function() {
    // Get share data from the backend
    $.ajax({
        url: '/getShares',
        type: 'GET',
        dataType: 'json',
        success: function(data) {
            console.log(data);
            var shareDataBody = $('#shareDataBody');
            shareDataBody.empty(); // Clear existing data

            data.forEach(function(share) {
                var row = $('<tr>');
                row.append($('<td>').text(share.username));
                row.append($('<td>').text(share.storename));
                row.append($('<td>').text(share.place));
                row.append($('<td>').text(share.startdate + ' 到 ' + share.enddate));
                row.append($('<td>').text(share.grade));

                // 添加 "查看詳細內容" 按鈕
                var detailButton = $('<button>').addClass('detailButton').text('查看詳細內容');
                detailButton.data('share', share); // 直接將整個 share 物件存儲在 data 屬性中
                row.append($('<td>').append(detailButton));


                // 添加 "留言" 按鈕
                var commentButton = $('<button>').addClass('commentButton').text('留言');
                commentButton.data('share-id', share.shareId); // 假設每個分享都有 shareId
                row.append($('<td>').append(commentButton));

                shareDataBody.append(row);
            });

            // 使用事件代理處理動態生成的 "查看詳細內容" 按鈕
            $(document).on('click', '.detailButton', function() {
                var share = $(this).data('share'); // 直接使用整個 share 物件
                var detailedContent = share.workdetail; // 將 workdetail 插入到 detailedContent 中
                $('#detailDialog').html(detailedContent).dialog({
                    modal: true,
                    title: '詳細內容',
                    width: 500,   // 寬度為500像素
                    height: 400,  // 高度為400像素
                    buttons: {
                        '關閉': function() {
                            $(this).dialog('close');
                        }
                    }
                });
            });
            

           // 使用事件代理處理動態生成的 "留言" 按鈕
           $(document).on('click', '.commentButton', function() {
            var share = $(this).data('share'); // 使用 share 而不是 shareId
            window.location.href = '/homePage' ;
        });


        }, 
        error: function(error) {
            console.log('Error fetching share data:', error);
        }
    });
});
