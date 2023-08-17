/**
 * 
 */
function storeLogin(event){
	event.preventDefault();
	const queryParams = {
	    account:$("#account").val(),
	   	password:$("#password").val()
	};
	const url = '/storelogin?' + $.param(queryParams);

	$.ajax({
	    url: url,
	    method: 'get',
	    dataType: 'text',
	    xhrFields:{withCredentials:true},
	    success: result,
	    error: function(error) {
	        console.error('Error:', error);
	    }
	});
}
    
function result(data){
    if (data === "登入成功") {
		alert(data);
        window.location.href = "/storeAccount2"; 
    } else {
        alert(data); 
    }
}
$("#loginForm").submit(storeLogin);