$(document).ready(getAll);
function getAll(){
    $.ajax({
        url:'/getAllContactUs',
        type:'get',
        contentType:'application/json',
        success:setContext,
        error:function(error){
            console.log(error)
        }
    })
}
function setContext(data){
    var messageData = $('#messageData');
    messageData.empty();
    data.forEach(function(value) {
        var row = $('<tr>');
        row.append($('<td>').text(value.contactUsId));
        row.append($('<td>').text(value.email));

        var contextButton = $('<button>').addClass('contextButton').text('詳細內容');
        contextButton.data('message',value.message);
        row.append($('<td>').append(contextButton));


        var replyButton = $('<button>').addClass('replyButton').text('回信');
        replyButton.data('reply',value);
        row.append($('<td>').append(replyButton));

        row.append($('</tr>'));
        messageData.append(row);
    })

    $(document).on('click', '.contextButton', function() {
        var contactUs = $(this).data('message'); // 直接使用整個 postJob 物件
        var Content = "信件詳細內容: " + contactUs;
        $('#contextDialog').html(Content).dialog({
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

    $(document).on('click', '.replyButton', function() {
        var replyTo = $(this).data('reply'); // 直接使用整個 postJob 物件
        var Content = "收件者:"+replyTo.email+"</br>"
        +"標題:打工換宿網"+replyTo.contactType+"之事宜"+"<br/>"
        +"信件內容:親愛的"+replyTo.name+"你好，我們是打工換宿網，於"+replyTo.contactDate+"收到您有關於"+replyTo.contactType+"的來信！"+"<br/>"
        +"您所傳送的內容如下："+replyTo.message+"（以下就是我們回信的內容）"+"<br/>";
        var additionalTextArea = '<textarea id="additionalText" rows="4" cols="50"></textarea>';
        Content += additionalTextArea;
        Content +="打工換宿網誠摯感謝您，祝順心！";
        $('#contextDialog').html(Content).dialog({
            modal: true,
            title: '詳細內容',
            width: 500,   // 寬度為500像素
            height: 400,  // 高度為400像素
            buttons: {
                '關閉': function() {
                    $(this).dialog('close');
                },'回信':function (){
                    var obj=new Object();
                    var contextArea=$("#additionalText").val();
                    obj.toEmail=replyTo.email;
                    obj.title="打工換宿網"+replyTo.contactType+"之事宜";
                    obj.subject="親愛的"+replyTo.name+"你好，我們是打工換宿網，於"+replyTo.contactDate+"收到您有關於"+replyTo.contactType+"的來信！"+"\n"+
                        "您所傳送的內容如下："+"\n"+replyTo.message+"\n"+"（以下就是我們回信的內容）"+"\n"+contextArea;
                    $.ajax({
                        url:'/sendReply',
                        type:'post',
                        datatype:'json',
                        contentType:'application/json',
                        data:JSON.stringify(obj),
                        success:function(data){alert("信件寄出成功")},
                        error:function(error){console.log(error)}
                    })

                }
            }
        });

    });
}


$(document).ready(function() {
    // 觸發按鈕
    $("#yourButtonID").click(function() {
        // 顯示隐藏的 div 元素
        $("#contextDialog, #replyDialog").css("display", "block");
    });
});

