package ru.practicum.category.data.dto;

import lombok.experimental.UtilityClass;
import ru.practicum.category.data.Category;

@UtilityClass
public class CategoryMapper {
    public Category toCategory(CategoryDto categoryDto) {
        return new Category(categoryDto.getId(), categoryDto.getName());
    }

    public CategoryDto toCategoryDto(Category category) {
        return new CategoryDto(category.getId(), category.getName());
    }

    public Category toCategory(NewCategoryDto newCategoryDto) {
        return new Category(null, newCategoryDto.getName());
    }
}
