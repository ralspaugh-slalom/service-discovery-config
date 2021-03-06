package restaurants.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import restaurants.domain.Restaurant;
import restaurants.domain.RestaurantResponse;

@FeignClient("restaurants")
public interface RestaurantsClient {
    @RequestMapping(method = RequestMethod.GET, value = "/restaurants")
    RestaurantResponse getRestaurants();

    @RequestMapping(method = RequestMethod.GET, value = "/restaurants/search/findByName")
    Restaurant findRestaurantByName(@RequestParam("name") String name);
}
