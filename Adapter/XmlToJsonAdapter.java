package Adapter;

//am fi putut face un adaptor de clase prin: adaptorul va fi derivat din clasa pt care ar fi fost gandit sa
//fie adapto
public class XmlToJsonAdapter implements JsonParser{
    private XmlParser xmlParser;
    public XmlToJsonAdapter(XmlParser xmlParser){
        this.xmlParser = xmlParser;
    }
    @Override
    public void parseJson(String json) {
     String xml = convertJsonToXml(json);
     xmlParser.parseXml(xml);
    }

    private String convertJsonToXml(String json){
        return null;
    }
}
