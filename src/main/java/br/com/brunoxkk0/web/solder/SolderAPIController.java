package br.com.brunoxkk0.web.solder;

import br.com.brunoxkk0.JTSolderApplication;
import br.com.brunoxkk0.data.model.internal.Api;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;


import javax.inject.Singleton;



@Singleton
@Controller("/v1")
public class SolderAPIController {

    @Get(uris = "/api")
    public Api onApi(){
        return JTSolderApplication.getApi();
    }

    @Get("/{username}/api")
    public Api onUser(@PathVariable String username){
        return JTSolderApplication.getApi();
    }

    @Get("/{username}/api/verify/{token}")
    public Api onUserVerify(@PathVariable String username, @PathVariable  String token){
        return JTSolderApplication.getApi();
    }

    @Get("/{username}/api/mod/{modName}")
    public Api onMod(@PathVariable String username, @PathVariable String modName){
        return JTSolderApplication.getApi();
    }

    @Get("/{username}/api/mod/{modName}/{version}")
    public Api onModVersion(@PathVariable String username, @PathVariable String modName, @PathVariable String modVersion){
        return JTSolderApplication.getApi();
    }

    @Get("/{username}/api/modpack")
    public Api onModpack(@PathVariable String username, @PathVariable String modName, @PathVariable String modVersion){
        return JTSolderApplication.getApi();
    }

    @Get("/{username}/api/modpack/{slug}")
    public Api onModpackSlug(@PathVariable String username, @PathVariable String modName, @PathVariable String modVersion, @PathVariable String slug){
        return JTSolderApplication.getApi();
    }

    @Get("/{username}/api/modpack/{slug}/{build}")
    public Api onModpackSlugBuild(@PathVariable String username, @PathVariable String modName, @PathVariable String modVersion, @PathVariable String slug, @PathVariable String build){
        return JTSolderApplication.getApi();
    }

}
