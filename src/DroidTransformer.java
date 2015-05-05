//public class DroidTransformer {
//
//
//    public Droid transformToDroid(Xml element){
//        if(element instanceof Label)
//            return new DroidTextView(((Label)element).getId(),((Label)element).getText());
//        else if(element instanceof Button)
//            return new DroidButton(((Button)element).getId(),((Button)element).getText());
//        else{
//            DroidGroup group = new DroidGroup(((XmlGroup)element).getId());
//            List<Object> xmlElements = ((XmlGroup)element).getElements();
//            for (Object xmlElement : xmlElements) {
//                group.addElement(transformToDroid((Xml) xmlElement));
//            }
//            return group;
//        }
//    }
//
//}
