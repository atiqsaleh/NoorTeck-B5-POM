package com.noorteck.qa.karateapi;
import org.junit.runner.RunWith;

import com.intuit.karate.KarateOptions;
import com.intuit.karate.junit4.Karate;


@RunWith(Karate.class)

@KarateOptions(features = "classpath:com/noorteck/qa/karateapi/US123-FindAPI.feature")


public class KarateRunner {

}
