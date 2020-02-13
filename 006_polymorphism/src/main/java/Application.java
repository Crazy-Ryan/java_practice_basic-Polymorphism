public class Application {
    public static void main(String[] args) {
        System.out.println("====================");
        clickF5Respond(new OnClickButton());
        System.out.println("====================");
        clickF5Respond(new OnClickButtonInIDEA());
        System.out.println("====================");
        clickF5Respond(new OnClickButtonInChrome());
        System.out.println("====================");
        clickF5Respond(new OnClickButtonInWechat());
        System.out.println("====================");
    }

    public static void clickF5Respond(OnClickButton pressF5) {
        pressF5.clickF5();
    }
}
