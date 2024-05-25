/*サイドバー開閉*/
$(function(){
	var isOpen = false;
	$(".header .button").on("click", function(){
		if (isOpen) {
			$('.sidebar').animate({
				left: '-356px'
			}, 200, 'swing');
		} else {
			$('.sidebar').animate({
				left: '0px'
			}, 200, 'swing');
		}
		
		isOpen = !isOpen;
	});
});
/*マウスがサイドバーから離れると閉じる*/
$(function(){
	$('.sidebar').on('mouseleave', function(){
		$('.sidebar').animate({
			left: '-356px'
		}, 200, 'swing');
	})
})