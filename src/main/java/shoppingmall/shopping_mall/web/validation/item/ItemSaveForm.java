package shoppingmall.shopping_mall.web.validation.item;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;
import shoppingmall.shopping_mall.itemService.item.ItemType;

import java.io.File;
import java.util.List;

@Data
public class ItemSaveForm {
    @NotBlank
    private String itemName;
    @NotNull
    @Min(1000)
    private Integer price;
    private String explanation;
    @NotNull
    @Min(1)
    private Integer quantity;
    private List<MultipartFile> imageFiles;
    @NotNull
    private ItemType itemType; // 상품 분류 종류

}
