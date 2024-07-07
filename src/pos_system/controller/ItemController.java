/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos_system.controller;

import pos_system.dto.ItemDto;
import pos_system.service.ServiceFactory;
import pos_system.service.custom.ItemService;
import java.util.ArrayList;

/**
 *
 * @author anjan
 */
public class ItemController {
    
    private ItemService itemService = (ItemService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.ITEM);
    
    public String saveItem(ItemDto itemDto) throws Exception{
        return itemService.save(itemDto);
    }
    
    public String updateItem(ItemDto itemDto) throws Exception{
        return itemService.update(itemDto);
    }
    
    public String deleteItem(String code) throws Exception{
        return itemService.delete(code);
    }
    
    public ItemDto getItem(String code) throws Exception{
        return itemService.get(code);
    }
    
    public ArrayList<ItemDto> getItemAll() throws Exception{
        return itemService.getAll();
    }
}
