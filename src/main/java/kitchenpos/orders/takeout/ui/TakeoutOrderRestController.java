package kitchenpos.orders.takeout.ui;

import kitchenpos.orders.takeout.application.TakeoutOrderService;
import kitchenpos.orders.takeout.domain.TakeoutOrder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.UUID;

@RequestMapping("/api/orders/take-out")
@RestController
public class TakeoutOrderRestController {
    private final TakeoutOrderService orderService;

    public TakeoutOrderRestController(final TakeoutOrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public ResponseEntity<TakeoutOrder> create(@RequestBody final TakeoutOrder request) {
        final TakeoutOrder response = orderService.create(request);
        return ResponseEntity.created(URI.create("/api/orders/take-out" + response.getId()))
            .body(response);
    }

    @PutMapping("/{orderId}/accept")
    public ResponseEntity<TakeoutOrder> accept(@PathVariable final UUID orderId) {
        return ResponseEntity.ok(orderService.accept(orderId));
    }

    @PutMapping("/{orderId}/serve")
    public ResponseEntity<TakeoutOrder> serve(@PathVariable final UUID orderId) {
        return ResponseEntity.ok(orderService.serve(orderId));
    }

    @PutMapping("/{orderId}/complete")
    public ResponseEntity<TakeoutOrder> complete(@PathVariable final UUID orderId) {
        return ResponseEntity.ok(orderService.complete(orderId));
    }

    @GetMapping
    public ResponseEntity<List<TakeoutOrder>> findAll() {
        return ResponseEntity.ok(orderService.findAll());
    }
}
