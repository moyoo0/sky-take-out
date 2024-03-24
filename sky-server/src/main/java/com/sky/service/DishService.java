package com.sky.service;

import com.sky.dto.DishDTO;
import org.springframework.stereotype.Service;

public interface DishService {
    /**
     * 新增菜品和口味数据
     * @param dishDTO
     */

    public void saveWithFlavor(DishDTO dishDTO);
}
