package view;

import com.google.gson.Gson;
import controller.controller;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.ArrayList;
import model.patient;

@Path("jakartaee9")
public class view {
    @GET
    @Path("listazas")
    public static Response listazas(){
    ArrayList<patient> betegek = controller.listazas();
    Gson gson = new Gson();
    String json = gson.toJson(betegek);
    return Response.ok(json).type(MediaType.APPLICATION_JSON).build();
    }
    
    @POST
    @Path("hozzaad")
    public static Response hozzaad(@QueryParam("taj") String taj, @QueryParam("nev") String nev, @QueryParam("by") String by, @QueryParam("kezd") String kezd, @QueryParam("betegseg") String betegseg,@QueryParam("allapot") String allapot){
    return Response.ok(controller.hozzaad(taj, nev, by,kezd, betegseg, allapot)).build();
    }

        @POST
    @Path("torles")
    public static Response torles(@QueryParam("id") String i){
        return Response.ok(controller.torles(i)).build();
    }
    
    @POST
    @Path("frissites")
    public static Response frissites(@QueryParam("id") String i, @QueryParam("up") String b, @QueryParam("edit") String x){
        return Response.ok(controller.frissites(i, b, x)).build();
    }
    
    @GET
    @Path("kereses")
    public static Response kereses(@QueryParam("id") String i){
        ArrayList<patient> betegek = new ArrayList<>();
        Gson gson = new Gson();
        String json = gson.toJson(betegek);
        betegek.add(controller.kereses(i));
        return Response.ok(json).type(MediaType.APPLICATION_JSON).build();
    }
}
