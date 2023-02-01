package task_java.connection.add_conn;

import task_java.connection.interface_conn.InterfaceAdress;
import task_java.connection.interface_conn.InterfaceEmail;
import task_java.connection.interface_conn.InterfacePhoneNumber;
import task_java.connection.interface_conn.InterfaceTelegram;
import task_java.connection.interface_conn.InterfaceVk;

public class AbdstractListCommunicationMethod implements InterfaceVk, InterfaceTelegram, InterfaceEmail,
                                                        InterfacePhoneNumber, InterfaceAdress{

    @Override
    public void vkMethod(){}

    @Override
    public void telegramMethod(){}

    @Override
    public void emailMethod(){}

    @Override
    public void phoneNumberMethod(){}

    @Override
    public void adressMethod() {}
}
