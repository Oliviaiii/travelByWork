
$(document).ready(function() {
    // 自動帶入日期postdate
    $("#postdate").val(moment().format("YYYY-MM-DD"));

    // 新增公告表單的事件處理器
    $("#addpost").submit(function(evt) {
        evt.preventDefault();
        var obj = {
            username: $("#username").val(),
            postdate: $("#postdate").val(),
            words: $("#words").val(),
            adminmemberid: $("#adminmemberid").val() 
        };

        $.ajax({
            url: "/posts/create", // 修改成後端接受新增請求的 API 路徑
            type: "post",
            contentType: "application/json",
            dataType: "json",
            data: JSON.stringify(obj),
            success: function(response) {
                // 在這裡處理成功後的操作，比如顯示訊息、重新導向頁面等
                console.log("Success:", response);
                window.location.href = "/whatFix"; // 重新導向到 /whatFix 頁面
            },
            error: function(error) {
                console.log("Error:", error);
            }
        });
    });
});

function result(data){
    if (data === "公告新增成功") {
        window.location.href = "/whatFix"; 
    } else {
        alert(data); 
    }
  }


$("#addpost").submit(whatFix);



// 查詢並顯示資料
$(document).ready(function() {
    // Get post data from the backend
    $.ajax({
        url: '/posts',
        type: 'GET',
        dataType: 'json',
        success: function(data) {
            console.log(data);
            var shareDataBody = $('#shareDataBody');
            shareDataBody.empty(); // Clear existing data

            data.forEach(function(item) {
                var row = $('<tr>');
                row.append($('<td>').text(item.postimportantid));
                row.append($('<td>').text(item.adminmemberid));
                row.append($('<td>').text(item.username));

                // 添加 "查看詳細內容" 按鈕
                var detailButton = $('<button>').addClass('detailButton').text('查看詳細內容');
                detailButton.data('item', item); 
                row.append($('<td>').append(detailButton));

                row.append($('<td>').text(item.postdate));

                // 添加 "刪除" 按鈕
                var delButton = $('<button>').addClass('delButton').text('刪除');
                delButton.data('item-id', item.postimportantid); // 使用 postimportantid 作為刪除按鈕的識別
                row.append($('<td>').append(delButton));

                shareDataBody.append(row);
            });

            // 使用事件代理處理動態生成的 "查看詳細內容" 按鈕
            $(document).on('click', '.detailButton', function() {
                var item = $(this).data('item'); 
                var detailedContent = item.words; // 將公告內容插入到 detailedContent 中
                $('#detailDialog').html(detailedContent).dialog({
                    modal: true,
                    title: '詳細內容',
                    width: 500,
                    height: 400,
                    buttons: {
                        '關閉': function() {
                            $(this).dialog('close');
                        }
                    }
                });
            });

            // 使用事件代理處理動態生成的 "刪除" 按鈕
            $(document).on('click', '.delButton', function() {
                var itemId = $(this).data('item-id'); // 使用 data('item-id') 取得要刪除的項目的 ID

                // 發起刪除請求到後端 API
                $.ajax({
                    url: '/posts/' + itemId + '/delete', // 假設這是你的刪除文章的 API 路徑
                    type: 'GET',
                    success: function(response) {
                        console.log("Success:", response);
                        // 更新前端資料，可以重新發起一次 GET 請求來更新列表
                        location.reload(); // 重新載入頁面
                    },
                    error: function(error) {
                        console.log("Error:", error);
                    }
                });
            });

        }, 
        error: function(error) {
            console.log('Error fetching share data:', error);
        }
    });
});
