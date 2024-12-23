package my.mydev.domain.cart.repository;

import jakarta.persistence.Id;
import my.mydev.domain.cart.domain.CartItem;
import my.mydev.domain.cart.domain.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface CartRepository extends JpaRepository<ShoppingCart, Long> {


    Optional<ShoppingCart> findByMemberId(Long memberId);


//    void deleteById(List<Long> cartItemIds);
}



