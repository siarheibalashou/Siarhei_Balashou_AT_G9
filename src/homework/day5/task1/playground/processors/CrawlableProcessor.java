package homework.day5.task1.playground.processors;

import homework.day5.task1.playground.essense.creatures.Crawlable;
import homework.day5.task1.playground.utils.DirectionGenerator;
import homework.day5.task1.playground.utils.DistanceGenerator;

import java.util.concurrent.ThreadPoolExecutor;

public class CrawlableProcessor {
    public void runCrawlable(Crawlable crawlable) {
        crawlable.crawl(DirectionGenerator.generateDirection(), DistanceGenerator.generateDisctance());
    }

    public void runCrawlable(Crawlable crawlable, String direction) {
        crawlable.crawl(direction, DistanceGenerator.generateDisctance());
    }

    public void runCrawlable(Crawlable crawlable, String direction, int distance) {
        crawlable.crawl(direction, distance);
    }
}
