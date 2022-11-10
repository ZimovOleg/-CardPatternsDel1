package ru.netology.cardTest.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Value;

@Value
@Data
@AllArgsConstructor
public class UserInfo {
    String city;
    String name;
    String phone;
}