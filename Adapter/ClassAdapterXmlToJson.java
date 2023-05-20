package Adapter;

public class ClassAdapterXmlToJson extends XmlParser implements JsonParser{
    @Override
    public void parseJson(String json) {
        String xml = convertJsonToXml(json);
        this.parseXml(xml);
    }
    private String convertJsonToXml(String json){
        return null;
    }
}
