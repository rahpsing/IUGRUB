/*global alert: false, console: false, jQuery: false */
/*global $, jQuery, alert*/

$(document).ready(function () {
    

/*$('.carousel').carousel({
    interval:2000;
    });
$('.carousel').carousel('cycle');*/

/* FILTER COLLAPSE */

/*
$(document).on('click', '.panel-heading span.clickable', function(e) {
    
    var $this = $(this);
        if (!$this.hasClass('panel-collapsed')) {
		      $this.parents('.panel').find('.panel-body').slideUp();
		      $this.addClass('panel-collapsed');
		      $this.find('i').removeClass('glyphicon-chevron-up').addClass('glyphicon-chevron-down');
	} else {
		      $this.parents('.panel').find('.panel-body').slideDown();
		      $this.removeClass('panel-collapsed');
		      $this.find('i').removeClass('glyphicon-chevron-down').addClass('glyphicon-chevron-up');
	}
    });
*/


/* BOTTOM BAR HANDLER */
$("#bottombutton").click(function () {
        $("#bottombar").hide('slow');
    });

/* RESTAURANT HANDLER */
    $("#overview").click(function () {
        $("#overview").addClass('active');
        $("#pricetable").addClass('active');
        $("#overview").removeClass('hidden');
        $("#pricetable").removeClass('hidden');
        $(".panel").addClass('hidden');
        $("#gallery").addClass('hidden');
    });
    
    $("#review").click(function () {
        $("#review").addClass('active');
        $(".panel").addClass('active');
        $("#review").removeClass('hidden');
        $(".panel").removeClass('hidden');
        $("#pricetable").addClass('hidden');
        $("#gallery").addClass('hidden');
    });
    
    $("#photos").click(function () {
        $("#photos").addClass('active');
        $("#gallery").addClass('active');
        $("#photos").removeClass('hidden');
        $("#gallery").removeClass('hidden');
        $("#pricetable").addClass('hidden');
        $(".panel").addClass('hidden');
    });
});
