/**
 * 
 */
function cate(cate) {
	$(".categori li").css("background-color","white");
	$(".categori a").css("color","black");
	if(cate=='left'){
		$(".cate-left").css("background-color","black");
		$(".cate-left a").css("color","#fff");
	}else if(cate=='mid'){
		$(".cate-mid").css("background-color","black");
		$(".cate-mid a").css("color","#fff");
	}else if(cate=='right'){
		$(".cate-right").css("background-color","black");
		$(".cate-right a").css("color","#fff");
	}
}