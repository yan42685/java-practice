- 用 map 替代 if 进行具体策略对象的选择 符合开闭原则。
- 添加策略时只需要增加一个 type 和 实现类 即可，不必修改 Factory 类

如果策略种类不是特别多的话，用下面这种反而更简单、更内聚
![img.png](img.png)