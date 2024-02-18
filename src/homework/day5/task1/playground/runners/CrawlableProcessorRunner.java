package homework.day5.task1.playground.runners;

import homework.day5.task1.playground.essense.creatures.*;
import homework.day5.task1.playground.processors.CrawlableProcessor;

public class CrawlableProcessorRunner {
    public static void main(String[] args) {
        CrawlableProcessor crawlableProcessor = new CrawlableProcessor();
        Crawlable crawlableCrocodile = new Crocodile(1723, "Neel Crawlable");
        Crawlable crawlableBeetle = new Beetle(43, "Christmas Crawlable");
        Vertebrata vertebrataCrocodile = new Crocodile(1723, "Neel Vertebrata");
        Insect insectBeetle = new Beetle(43, "Christmas Insect");
        Crocodile aCrocodile = new Crocodile(1723, "Neel Crocodile");
        Beetle aBeetle = new Beetle(43, "Christmas Beetle");
        Crawlable anonymousCrawlable = new Crawlable() {
            String name = "Anonymous";

            @Override
            public void crawl(String direction, int distance) {
                System.out.printf("I am %s, my name is %s and I am crawling to %s for %d units%n",
                        this.getClass().getSimpleName(), name, direction, distance);
            }
        };
        crawlableProcessor.runCrawlable(crawlableBeetle);
        crawlableProcessor.runCrawlable(crawlableCrocodile);
        crawlableProcessor.runCrawlable(aCrocodile);
        crawlableProcessor.runCrawlable(aBeetle);
        crawlableProcessor.runCrawlable(anonymousCrawlable);
        /*crawlableProcessor.runCrawlable(vertebrataCrocodile); Insect и Crawlable не имплементят методы из интерфейся Crawlable, не являются наследниками Beetle
        Crocodile;
        crawlableProcessor.runCrawlable(insectBeetle);*/
        crawlableProcessor.runCrawlable(crawlableBeetle, "никуда");
        crawlableProcessor.runCrawlable(aCrocodile, "налево");
        crawlableProcessor.runCrawlable(aCrocodile, "назад", 37);
        crawlableProcessor.runCrawlable(new Crawlable() {
            String name = "Gena";

            @Override
            public void crawl(String direction, int distance) {
                System.out.printf("I am %s, my name is %s and I am crawling to %s for %d units%n",
                        this.getClass().getSimpleName(), name, direction, distance);
            }
        }, "вниз", 37);
    }
}
