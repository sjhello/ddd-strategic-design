package kitchenpos.application.orders.takeout;


import kitchenpos.orders.takeout.domain.TakeoutOrder;
import kitchenpos.orders.takeout.domain.TakeoutOrderRepository;

import java.util.*;

public class InMemoryTakeoutOrderRepository implements TakeoutOrderRepository {
    private final Map<UUID, TakeoutOrder> orders = new HashMap<>();

    @Override
    public TakeoutOrder save(final TakeoutOrder order) {
        orders.put(order.getId(), order);
        return order;
    }

    @Override
    public Optional<TakeoutOrder> findById(final UUID id) {
        return Optional.ofNullable(orders.get(id));
    }

    @Override
    public List<TakeoutOrder> findAll() {
        return new ArrayList<>(orders.values());
    }
}