package Adapter;

public class Main {
    public static void main(String[] args) {
        //Adapter : de clase sau de obiecte (face conversia intre obiecte sau intre clase)
        // criterii :
        // relatie de is a cu o anumita interfata si relatia de has a
        // adaptor implem interface pt element si sa contina un ob care sa fie de tipul celalalt
        XmlParser xmlParser = new XmlParser();
        JsonParser jsonParser = new XmlToJsonAdapter(xmlParser);
        jsonParser.parseJson("{\"name\":\"John\", \"age\":\"30\"}");

        ClassAdapterXmlToJson jsonParserClass = new ClassAdapterXmlToJson();
        jsonParserClass.parseJson("{\"name\":\"John\", \"age\":\"30\"}");
    }
}
