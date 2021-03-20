package br.com.brunoxkk0.data.model.internal;

import io.micronaut.core.annotation.Introspected;

@Introspected
public class Api {

    private final String api;
    private final String version;
    private final String stream;

    public Api(String api, String version, String stream) {
        this.api = api;
        this.version = version;
        this.stream = stream;
    }

    public String getApi() {
        return api;
    }

    public String getStream() {
        return stream;
    }

    public String getVersion() {
        return version;
    }

    @Override
    public String toString() {
        return "Api{" +
                "api='" + api + '\'' +
                ", version='" + version + '\'' +
                ", stream='" + stream + '\'' +
                '}';
    }
}
