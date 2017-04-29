package br.edu.fcv.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.edu.fcv.model.ApiResponse;
import br.edu.fcv.model.Produto;

@Path("/json/product")
public class JSONService {

	@GET
	@Path("/get")
	@Produces("application/json")
	public Produto getProdutoJSON() {
		Produto produto = new Produto();
		produto.setNome("Moto X - Android");
		produto.setQuantidade(10);

		return produto;
	}

	@GET
	@Path("/listaprodutos")
	@Produces("application/json")
	public ApiResponse getListaProdutos(){
		List<Produto> novaLista = new ArrayList<Produto>();
		
		Produto motoX = new Produto();
		motoX.setNome("Moto X - Android");
		motoX.setQuantidade(10);
		novaLista.add(motoX);

		Produto galaxy = new Produto();
		galaxy.setNome("Galaxy 7");
		galaxy.setQuantidade(15);
		novaLista.add(galaxy);

		Produto iphone = new Produto();
		iphone.setNome("Iphone");
		iphone.setQuantidade(5);
		novaLista.add(iphone);

		ApiResponse apiResponse = new ApiResponse();
		apiResponse.setProdutos(novaLista);

		return apiResponse;
	}


}
