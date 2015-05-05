/**
 * Created by saylik on 04/05/15.
 */
//public class IosTransformer {
//    public Ios transformToIos(Xml element){
//        if(element instanceof Label)
//            return new TextField(((Label)element).getId(),((Label)element).getText());
//        else if(element instanceof Button)
//            return new IosButton(((Button)element).getId(),((Button)element).getText());
//        else{
//            IosGroup group = new IosGroup(((XmlGroup)element).getId());
//            List<Object> xmlElements = ((XmlGroup)element).getElements();
//            for (Object xmlElement : xmlElements) {
//                group.addElement(transformToIos((Xml)xmlElement));
//            }
//            return group;
//        }
//    }
//
//}
