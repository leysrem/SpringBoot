<#include "../bases/importbase.ftl"/>


<div class="container">
	<div class="row">
		<div class="col-12">
			<nav class="navbar justify-content-between px-0">
			  <h2 class="navbar-brand">List Books</h2>
			</nav>
		</div>
		<div class="col-12">
				<a type="button" class="btn btn-primary" href="/book/create">Add book</a>
		</div>

	</div>
	


	<div class="d-flex flex-wrap justify-content-center">
		<#list items as book>
      <div  class="card text-center" style="width: 15rem; margin-right:5rem; margin-left:5rem;margin-top: 1rem">
        <img class="card-img-top" src="https://img.icons8.com/ios/452/open-book.png">
        <div class="card-body">
          <h5 class="card-title">${book.name}</h5>
	    <p class="card-text">${book.price}.</p>
	    <p class="card-text">${book.nbrpages}.</p>
          <a href="#" class="btn btn-primary">Afficher</a>
        </div>
      </div>
     	 </#list>
    </div>
	
</div>
