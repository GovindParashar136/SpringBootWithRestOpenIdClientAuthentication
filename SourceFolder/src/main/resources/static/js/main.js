$(document).ready(function() {

	$("#requestForm").submit(function(event) {

		//stop submit the form, we will post it manually.
		event.preventDefault();

		fire_ajax_submit();

	});

});

function fire_ajax_submit() {
	
	var grantType= $("#grantType").children("option").filter(":selected").val();

	// PREPARE FORM DATA
	var formData = {
		authorizeEndPoint : $("#authorizeEndPoint").val(),
		tokenEndPoint : $("#tokenEndPoint").val(),
		clientName :  $("#clientName").val(),
		clientSecret :  $("#clientSecret").val(),
		userName :  $("#userName").val(),
		password : $("#password").val(),
		redirectUri :  $("#redirectUri").val(),
		grantType : grantType,
		scope :  $("#scope").val(),
		userEndPoint:  $("#userEndPoint").val()
		
	};
	alert();
alert(JSON.stringify(formData));
	var protocol = window.location.protocol;
	var host = window.location.host;
	var pathArray = window.location.pathname.split('/');
	var pathName = pathArray[1];
	$.ajax({
		type : "POST",
		contentType : "application/json",
		url : protocol + "//" + host + "/" + pathName + "/response",
		data : JSON.stringify(formData),
		dataType : 'json',
		cache : false,
		timeout : 600000,
		success : function(data) {

			var json = "<h4>Request Response</h4><pre>"
					+ JSON.stringify(data, null, 4) + "</pre>";
			$("#bth-request").prop("disabled", false);
			$('#feedback').html(json);

		},
		error : function(e) {

			var json = "<h4>Request Response</h4><pre>" + e.responseText
					+ "</pre>";
			$('#feedback').html(json);

			console.log("ERROR : ", e);
			$("#btn-search").prop("disabled", false);

		}
	});

}
