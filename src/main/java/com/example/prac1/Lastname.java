package com.example.prac1;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

@Path("/author-surname")
public class Lastname
{
    @GET
    @Produces("text/plain")
    public String hello()
    {
        return "Volodymyr Prokopchuk";
    }
}