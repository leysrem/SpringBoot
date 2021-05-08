<#include "../bases/importbase.ftl"/>

<div class="container">
	<div class="row">
		<div class="col-12">
			<nav class="navbar justify-content-between px-0">
			  <h2 class="navbar-brand">Add a Book</h2>
			</nav>
		</div>
	</div>
	<div class="row">
		<div class="col-12">

			<form method="POST">
				<div class="form-group">
					<label for="name">Title</label>
					<input class="form-control" type="text" id="name" name="name" />
				</div>
				<div class="form-group">
					<label for="nbPages">Number of pages</label>
					<input class="form-control" type="number" id="nbrpages" name="nbrpages"/>
				</div>
				<div class="form-group ">
				  <label for="price">Price</label>
				  <div class="input-group">
					  <input class="input-control form-control" type="number" id="price" name="price" />
					  <div class="input-group-append">
					    <span class="input-group-text">$</span>
					  </div>
				  </div>
				</div>

				<div class="row text-right">
			  		<div class="col-12">
						<input type="submit" class="btn btn-primary" value="Add book"/>
					</div>
				</div>

			</form>

		</div>
	</div>
</div>