package entity;


import lombok.Data;

import java.io.Serializable;

@Data
public class Order implements Serializable {



    private static final long serialVersionUID = 9111357402963030257L;

    private String id;

    private String name;

    private String messageId; //消息到唯一标志

}
