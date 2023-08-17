/**
 * 
 */
function storeSignUp(event){
	event.preventDefault();
    const storemember = {};
    storemember.storeName = $("#storename").val();
    storemember.ownerName = $("#ownername").val();
    storemember.account = $("#account").val();
    storemember.password = $("#password").val();
    storemember.email = $("#email").val();
    storemember.mobile = $("#mobile").val();
    storemember.phone = $("#phone").val();
    storemember.address = $("#address").val();
    storemember.createTime = $("#createtime").val();
                 
   $.ajax({
        url: 'storesignup',					
        type: 'post',
        dataType: 'text',  					
        contentType: 'application/json', 	    
        data: JSON.stringify(storemember),								
        success: result,					 
        error: function (myerror) { console.log(myerror) ;}
    });
}

function result(data){
    if (data === "新增成功") {
        window.location.href = "/emailProof2"; 
    } else {
        alert(data); 
    }
}


$("#storeSignUpForm").submit(storeSignUp);