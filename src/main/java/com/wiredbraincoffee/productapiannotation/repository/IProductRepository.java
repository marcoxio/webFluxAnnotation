package com.wiredbraincoffee.productapiannotation.repository;

import com.wiredbraincoffee.productapiannotation.model.Product;
import org.reactivestreams.Publisher;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface IProductRepository extends ReactiveMongoRepository<Product, String> {
//    Flux<Product> findByNameOrderByPrice(Publisher<String> name);
}
