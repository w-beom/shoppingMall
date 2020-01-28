$(function(){
	var images = [
		"/images/main-img1.jpg", 
		"/images/main-img2.jpg",
		"/images/main-img3.jpg"];
	
	$(".visual-img li>div").css("width","100%").css("height","760px");
	for (i = 0; i < images.length ; i++) {
		  $(".visual-img li>div").eq(i).css("background-image","url("+images[i]+")").css("background-size","100%").css("background-repeat","no-repeat");
	}

});

