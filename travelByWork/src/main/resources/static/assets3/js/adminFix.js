$(document).ready(function() {
    // 使用AJAX
    $.ajax({
        url: "/getAdmin", 
        type: "GET",
        dataType: "json",
        success: function(data) {
           
            // 處理取來資訊
            const tableBody = $("#shareDataBody");
            tableBody.empty();

            data.forEach(function(item) {
                const row = "<tr>" +
                    "<td>" + item.adminmemberid + "</td>" +
                    "<td>" + item.name + "</td>" +
                    "<td>" + item.username + "</td>" +
                    "<td>" + item.mobile + "</td>" +
                    "<td>" + item.account + "</td>" +
                    "<td>" + item.createtime + "</td>" +
                    "<td><button class='delete-btn' data-id='" + item.storeworklistid + "'>删除</button></td>" +
                    "</tr>";
                tableBody.append(row);
            });

            // 添加刪除處理 還沒做
            $(".delete-btn").click(function() {
                const jobId = $(this).data("id");
                // 調用刪除函數，調用 jobId（我先隨變取名字）等信息 
                deleteJob(jobId);
            });
        },
       
    });
});

// 删除按鈕 還沒做
function deleteJob(jobId) {
    // 使用AJAX發送刪除請求
    $.ajax({
        url: "/deleteJob", // 替换成請求URL
        type: "DELETE",
        data: { jobId: jobId }, // 根据需要傳參數
        success: function(response) {
            // 在成功后執行的操作，例如重新加載數據
            // 調用之前的獲取數據邏輯，重新弄表格
        },
        error: function(error) {
            // 發生錯誤的diolid
        }
    });
}
