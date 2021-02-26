$(function() {
	//Display and populate the update model
	$('table #editButton').on('click', function(event) {
		event.preventDefault();
		/*
		 *  /countries/findById/?id=1
		 * */
		var href = $(this).attr('href');

		$.get(href, function(country, status) {
			$('#idEdit').val(country.id);
			$('#editCode').val(country.code);
			$('#editCountry').val(country.description);
			$('#editCapital').val(country.capital);
			$('#editContinent').val(country.continent);
			$('#editNationality').val(country.nationality);
		});
		$('#editModal').modal();
	});

	//Display the delete modal
	$('table #deleteButton').on('click', function(event){
		event.preventDefault();
		
		var href = $(this).attr('href');
		
		$('#confirmDeleteButton').attr('href', href);
		
		$('#deleteModal').modal();
	});
	
});