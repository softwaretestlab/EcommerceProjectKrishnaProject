package common;


import org.junit.Assert;

public class AssertResponse {

    public static void VerifyMsgCon(String ExpectedResponse, String ActualResponse ){
        Assert.assertTrue(ExpectedResponse.contains(ActualResponse));
    }

    public static void VerifyMsgMatch(String ExpectedResponse, String ActualResponse) {
        Assert.assertEquals(ExpectedResponse,ActualResponse);
    }
    public static void VerifyMsgDbl(double ExpectedResponse, double ActualResponse) {
        Assert.assertEquals(ExpectedResponse, ActualResponse, 0);

    }
}
