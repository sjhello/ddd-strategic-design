# 키친포스

## 퀵 스타트

```sh
cd docker
docker compose -p kitchenpos up -d
```

## 요구 사항

### 상품

- 상품을 등록할 수 있다.
- 상품의 가격이 올바르지 않으면 등록할 수 없다.
    - 상품의 가격은 0원 이상이어야 한다.
- 상품의 이름이 올바르지 않으면 등록할 수 없다.
    - 상품의 이름에는 비속어가 포함될 수 없다.
- 상품의 가격을 변경할 수 있다.
- 상품의 가격이 올바르지 않으면 변경할 수 없다.
    - 상품의 가격은 0원 이상이어야 한다.
- 상품의 가격이 변경될 때 메뉴의 가격이 메뉴에 속한 상품 금액의 합보다 크면 메뉴가 숨겨진다.
- 상품의 목록을 조회할 수 있다.

### 메뉴 그룹

- 메뉴 그룹을 등록할 수 있다.
- 메뉴 그룹의 이름이 올바르지 않으면 등록할 수 없다.
    - 메뉴 그룹의 이름은 비워 둘 수 없다.
- 메뉴 그룹의 목록을 조회할 수 있다.

### 메뉴

- 1 개 이상의 등록된 상품으로 메뉴를 등록할 수 있다.
- 상품이 없으면 등록할 수 없다.
- 메뉴에 속한 상품의 수량은 0 이상이어야 한다.
- 메뉴의 가격이 올바르지 않으면 등록할 수 없다.
    - 메뉴의 가격은 0원 이상이어야 한다.
- 메뉴에 속한 상품 금액의 합은 메뉴의 가격보다 크거나 같아야 한다.
- 메뉴는 특정 메뉴 그룹에 속해야 한다.
- 메뉴의 이름이 올바르지 않으면 등록할 수 없다.
    - 메뉴의 이름에는 비속어가 포함될 수 없다.
- 메뉴의 가격을 변경할 수 있다.
- 메뉴의 가격이 올바르지 않으면 변경할 수 없다.
    - 메뉴의 가격은 0원 이상이어야 한다.
- 메뉴에 속한 상품 금액의 합은 메뉴의 가격보다 크거나 같아야 한다.
- 메뉴를 노출할 수 있다.
- 메뉴의 가격이 메뉴에 속한 상품 금액의 합보다 높을 경우 메뉴를 노출할 수 없다.
- 메뉴를 숨길 수 있다.
- 메뉴의 목록을 조회할 수 있다.

### 주문 테이블

- 주문 테이블을 등록할 수 있다.
- 주문 테이블의 이름이 올바르지 않으면 등록할 수 없다.
    - 주문 테이블의 이름은 비워 둘 수 없다.
- 빈 테이블을 해지할 수 있다.
- 빈 테이블로 설정할 수 있다.
- 완료되지 않은 주문이 있는 주문 테이블은 빈 테이블로 설정할 수 없다.
- 방문한 손님 수를 변경할 수 있다.
- 방문한 손님 수가 올바르지 않으면 변경할 수 없다.
    - 방문한 손님 수는 0 이상이어야 한다.
- 빈 테이블은 방문한 손님 수를 변경할 수 없다.
- 주문 테이블의 목록을 조회할 수 있다.

### 주문

- 1개 이상의 등록된 메뉴로 배달 주문을 등록할 수 있다.
- 1개 이상의 등록된 메뉴로 포장 주문을 등록할 수 있다.
- 1개 이상의 등록된 메뉴로 매장 주문을 등록할 수 있다.
- 주문 유형이 올바르지 않으면 등록할 수 없다.
- 메뉴가 없으면 등록할 수 없다.
- 매장 주문은 주문 항목의 수량이 0 미만일 수 있다.
- 매장 주문을 제외한 주문의 경우 주문 항목의 수량은 0 이상이어야 한다.
- 배달 주소가 올바르지 않으면 배달 주문을 등록할 수 없다.
    - 배달 주소는 비워 둘 수 없다.
- 빈 테이블에는 매장 주문을 등록할 수 없다.
- 숨겨진 메뉴는 주문할 수 없다.
- 주문한 메뉴의 가격은 실제 메뉴 가격과 일치해야 한다.
- 주문을 접수한다.
- 접수 대기 중인 주문만 접수할 수 있다.
- 배달 주문을 접수되면 배달 대행사를 호출한다.
- 주문을 서빙한다.
- 접수된 주문만 서빙할 수 있다.
- 주문을 배달한다.
- 배달 주문만 배달할 수 있다.
- 서빙된 주문만 배달할 수 있다.
- 주문을 배달 완료한다.
- 배달 중인 주문만 배달 완료할 수 있다.
- 주문을 완료한다.
- 배달 주문의 경우 배달 완료된 주문만 완료할 수 있다.
- 포장 및 매장 주문의 경우 서빙된 주문만 완료할 수 있다.
- 주문 테이블의 모든 매장 주문이 완료되면 빈 테이블로 설정한다.
- 완료되지 않은 매장 주문이 있는 주문 테이블은 빈 테이블로 설정하지 않는다.
- 주문 목록을 조회할 수 있다.

## 사용자 역할
| 한글명   | 영문명             | 설명                                                   |
|-------|-----------------|------------------------------------------------------|
| 손님    | Customer        | 키친포스를 이용하는 사용자                                   |
| 사장님   | Owner           | 키친포스를 운영하는 사용자                                   |
| 배달대행사 | Delivery Agency | 키친포스에 배달 주문이 발생하는 경우 음식을 손님에게 제공해주는 라이더를 배정해주는 사용자 |
| 라이더   | Rider           | 키친포스에 배달 주문이 발생하는 경우 음식을 손님에게 제공해주는 사용자          |

## 용어 사전

### 사용자 역할
| 한글명   | 영문명             | 설명                                                   |
|-------|-----------------|------------------------------------------------------|
| 손님    | Customer        | 주문을 하는 주체                                   |
| 사장님   | Owner           | 키친포스를 사용하는 주체                                   |
| 배달대행사 | Delivery Agency | 키친포스에 배달 주문이 발생하는 경우 음식을 손님에게 제공해주는 라이더를 배정해주는 외부 시스템 |
| 라이더   | Rider           | 키친포스에 배달 주문이 발생하는 경우 음식을 손님에게 제공해주는 사람          |

### 상품
| 한글명      | 영문명                  | 설명                                        |예시                   |
|----------|----------------------|-------------------------------------------|----------------------------------------
| 상품       | Product              | 키친포스에서 등록할 수 있는 상품은 가격, 이름으로 구성되는 단일 품목이다 | 후라이드, 콜라
| 상품 가격    | Product Price        | 상품의 가격이며 음수가 될 수 없다.                      |
| 상품 이름    | Product Name         | 상품의 이름이며 상품의 이름은 비속어를 포함 할 수 없다.          |
| 비속어      | Profanity         | 비속어                                       |
| 상품 등록    | Create Product       | 상품을 키친포스에 등록한다.                           |
| 상품 가격 변경 | Change Product Price | 상품의 가격을 변경한다                              |
| 상품 목록 조회 | Products             | 키친포스에 등록되어 있는 상품 목록을 확인한다                 |

### 메뉴그룹
| 한글명      | 영문명               | 설명                          |예시                   |
|----------|-------------------|-----------------------------|----------------------------------------
| 메뉴 그룹    | Menu Group        | 메뉴들을 특정한 기준대로 모은 `메뉴의 집합`이다 | 치킨, 음료, 콤보 메뉴
| 메뉴 그룹 이름 | Menu Group Name        | `메뉴 집합`의 이름                 |
| 메뉴그룹 등록  | Create Menu Group | 메뉴 그룹을 등록한다                 |
| 메뉴그룹 조회  | MenuGroups        | 메뉴 그룹의 목록을 확인한다             |

### 메뉴 속성
| 한글명      | 영문명               | 설명                                             |예시                   |
|----------|-------------------|------------------------------------------------|----------------------------------------
| 메뉴       | Menu              | 상품을 키친포스에서 팔기 위해 등록하는 단위를 말하며 메뉴는 상품으로 구성되어 있다 | 후라이드 콜라 콤보
| 메뉴 이름    | Menu Name         | 메뉴의 이름이며 메뉴의 이름은 비속어를 포함 할 수 없다.               |
| 비속어      | Profanity         | 비속어                                       |
| 메뉴 가격    | Menu Price        | 메뉴의 가격이며 메뉴의 가격은 음수가 될 수 없고 메뉴 구성 상품의 가격의 합보다 같거나 낮아야 한다.
| 메뉴 구성 상품 | Menu Product      | 메뉴 구성 상품은 상품과 수량으로 구성된다                     | 후라이드 콜라 콤보의 메뉴 구성 상품은 후라이드 1개와 콜라 1개.
| 메뉴 공개 상태 | Menu Displayed    | 메뉴의 공개 상태를 말한다. 메뉴의 공개 상태는 `공개`, `비공개` 있다    |

### 메뉴의 행위
| 한글명      | 영문명               | 설명                                             |예시                   |
|----------|-------------------|------------------------------------------------|----------------------------------------
| 메뉴 등록    | Create Menu       | 메뉴를 등록한다.                                      |
| 메뉴 가격 변경 | Change Menu Price | 메뉴의 가격을 변경한다.                                  |
| 메뉴 목록 조회 | Menus             | 메뉴의 목록을 확인한다.                                  |
| 메뉴 공개    | Display Menu      | 메뉴를 공개 시킨다.                                    |
| 메뉴 비공개    | Hide Menu         | 메뉴를 비공개 시긴다.                                       | 사장님이 직접 비공개처리 할 수 있으며, 메뉴 가격이 메뉴 구성 상품의 합보다 높다면 자동으로 비공개 처리 된다.

### 주문 테이블 속성
| 한글명          | 영문명                   | 설명                                            |예시                   |
|--------------|-----------------------|-----------------------------------------------|----------------------------------------
| 주문 테이블       | Order Table           | 손님들이 앉아서 식사 할 수 있는 키친포스의 테이블을 의미한다.           |1번 테이블
| 주문 테이블 이름    | Order Table Name      | 주문 테이블의 이름이며 비속어를 포함 할 수 없다.                  |
| 주문 테이블 인원    | Number Of Guests      | 주문 테이블을 사용하는 손님의 수.                           |
| 테이블 점유 상태    | Order Table Status    | 테이블의 점유 여부를 말한다.                              |

### 주문 테이블의 행위
| 한글명          | 영문명                   | 설명                                            |예시                   |
|--------------|-----------------------|-----------------------------------------------|----------------------------------------
| 주문 테이블 등록    | Order Table Create    | 주문 테이블을 등록한다.                                 |
| 테이블 점유       | Occupied              | 손님이 테이블을 사용할 수 없는 상태로 변경한다                    |테이블에 손님이 앉는다. 테이블 사용 상태가 `점유`으로 변경 된다.
| 테이블 미점유      | Not Occupied          | 손님이 테이블을 사용할 수 있는 상태로 변경한다                    |테이블에 있던 손님이 떠난다. 테이블 사용상태고 `미점유`으로 변경되며 테이블의 손님 수가 0명이 된다.
| 손님 수 변경      | Chage Number Of Guest | 테이블의 손님 수를 변경한다. 테이블의 손님이 0명 이상 일때 변경 할 수 있다. |
| 주문 테이블 목록 조회 | OrderTables           | 주문 테이블의 목록을 확인한다.                             |

### 주문 속성
| 한글명   | 영문명             | 설명                                                             |예시                   |
|-------|-----------------|----------------------------------------------------------------|----------------------------------------
| 주문    | Order           | 키친포스의 메뉴를 구매한 구매정보를 말한다.                                       |
| 주문 종류 | Order Type      | 주문의 타입은 `배달 주문`, `포장 주문`, `매장 주문` 3가지 종류을 갖는다.                 |
| 주문 상태 | Order Status    | 주문의 상태는 `대기`, `수락`, `음식 제공됨`, `배달중`, `배달완료`, `완료` 6가지 상태를 갖는다. |
| 주문 일시 | Order Date Time | 주문이 생성된 날짜                                                     |
| 주문 항목 | Order Line Item | 주문의 `메뉴`                                                       |
| 주문 수량 | Order Quantity  | 주문한 메뉴의 `수량`. `매장 주문`일 경우에만 음수가 허용된다.                          |
| 주문 가격 | Order Price     | 주문한 `메뉴의 가격(메뉴의 가격 * 수량)`                                      
| 주문서   | Order Sheet     | 주문서는 (`주문 항목`, `주문 수량`, `주문 가격`)의 목록으로 이루어져 있다.                |

### 주문의 행위
| 한글명          | 영문명                   | 설명                                            |
|--------------|-----------------------|-----------------------------------------------|
| 주문 등록     | Create Order   |  주문을 등록한다.                              |
| 주문 접수     | Accept Order   |  주문을 접수한다.                              |
| 주문 음식 제공     | Serve Order   |  주문에 대한 음식을 제공한다.                              |
| 주문 완료     | Complete Order   |  주문을 완료한다.                              |

### 매장 주문
| 한글명          | 영문명                   | 설명                                                   |
|--------------|-----------------------|------------------------------------------------------|
| 매장 주문        | Eat In Order          | 키친포스의 테이블에서 식사를 하는 주문이다.                             |
| 매장 주문 수량     | Eat In Order Quantity | 주문서는 `메뉴`, `수량`, `메뉴의 가격(메뉴 가격 * 수량)` 으로 이루어져 있다.    |
| 매장 주문의 상태    | Eat In Order Status   | 매장 주문의 상태는 `대기`, `수락`, `음식이 손님에게 제공됨`, `완료` 이다.            |
| 매장 주문 등록     | Create Eat In Order   | 손님이 매장 주문을 요청한다.                                     |
| 매장 주문 접수     | Accept Eat In Order   | 사장님이 매장 주문을 접수한다. 주문의 상태가 `대기`에서 `접수`으로 변경된다.        |
| 매장 주문 음식 제공됨 | Serve Eat In Order    | 손님에게 음식을 제공한다. 주문의 상태가 `수락`에서 `음식이 손님에게 제공됨`으로 변경된다. |
| 매장 주문 완료     | Complete Eat In Order | 매장 주문이 완료된다. 주문의 상태가 `음식이 손님에게 제공됨`에서 `완료`로 변경된다.    |

### 포장 주문
| 한글명          | 영문명                   | 설명                                                   |
|--------------|-----------------------|------------------------------------------------------|
| 포장 주문        | Take Out Order        | 손님이 키친포스에서 식사를 하는 것이 아닌 제공된 음식을 포장해가는 주문이다.          |
| 포장 주문의 상태    | Take Out Order Status   | 포장 주문의 상태는 `대기`, `수락`, `음식이 손님에게 제공됨`, `완료` 이다.      |
| 포장 주문 등록     | Create Take Out Order   | 손님이 포장 주문을 요청한다.                                     |
| 포장 주문 접수     | Accept Take Out Order   | 사장님이 포장 주문을 수락한다. 주문의 상태가 `대기`에서 `수락`으로 변경된다.        |
| 포장 주문 음식 제공됨 | Serve Take Out Order    | 손님에게 음식을 제공한다. 주문의 상태가 `수락`에서 `음식이 손님에게 제공됨`으로 변경된다. |
| 포장 주문 완료     | Complete Take Out Order | 포장 주문이 완료된다. 주문의 상태가 `음식이 손님에게 제공됨`에서 `완료`로 변경된다.          |

### 배달 주문
| 한글명          | 영문명                     | 설명                                                                 |예시                   |
|--------------|-------------------------|--------------------------------------------------------------------|----------------------------------------
| 배달 주문        | Delivery Order          | 손님이 주문서에 입력한 주소에 음식을 배달해 주는 주문을 말한다.                               |
| 배달 주소        | Delivery Address        | 배달 주문지 라이더가 음식을 전달해야할 주소이다.                                        | 서울시 노원구....
| 배달 주문의 상태    | Delivery Order Status   | 배달 주문의 상태는 `대기`, `수락`, `음식이 라이더에게 제공됨`, `배달 시작`, `배달 완료` `완료` 이다.  |
| 배달 주문 등록     | Create Delivery Order   | 손님이 배달 주문을 요청한다.                                                   |
| 배달 주문 접수     | Accept Delivery Order   | 사장님이 배달 주문을 수락하며 배달대행사에게 라이더 배정을 요청한다. 주문의 상태가 `대기`에서 `수락`으로 변경된다. |
| 배달 주문 음식 제공됨 | Serve Delivery Order    | 사장님이 라이더에게 음식을 제공한다. 주문의 상태가 `수락`에서 `음식이 라이더에게 제공됨` 변경된다.          |
| 배달 시작        | Start Delivery          | 라이더가 배달을 시작한다. 주문의 상태가 `음식이 라이더에게 제공됨`에서 `배달중`으로 변경된다.             |
| 배달 완료        | Complete Delivery       | 라이더가 배달을 완료한다. 주문의 상태가 `배달중`에서 `배달 완료`로 변경된다.                    |
| 배달 주문 완료     | Complete Delivery Order | 배달 주문이 완료된다. 주문의 상태가 `배달 완료`에서 `완료`로 변경된다.                         |

## 모델링

### 상품
#### 속성
- `Product`는 식별자를 갖는다.
- `Product`는 `Product Price`를 갖는다.
- `Product`는 `Product Name`을 갖는다.

#### 행위
- `Product`를 등록한다.
- `Product Price`를 변경한다.
- `Product` 목록을 조회한다.

#### 정책
- `Product Price`는 음수가 될 수 없다.
- `Product Name`는 `Profanity`를 포함 할 수 없다.
- `Produc Price`가 변경될 때 `Menu Product` 상품 금액의 합보다 크다면 메뉴가 숨겨진다.

### 메뉴 그룹
#### 속성
- `Menu Group`은 식별자를 갖는다.
- `Menu Group`은 `Menu Group Name`을 갖는다.

#### 행위
- `Menu Group`을 등록 한다.
- `Menu Group` 목록을 조회 한다.

#### 정책
- `Menu Group`의 `Menu Group Name`은 공백이 될 수 없다.

### 메뉴
#### 속성
- `Menu`는 식별자를 갖는다.
- `Menu`는 `Menu Name`을 갖는다.
- `Menu`는 `Menu Price`를 갖는다.
- `Menu`는 `Menu Group`을 갖는다.
- `Menu`는 `Menu Product`를 갖는다.
  - `Menu Product`는 식별자를 갖는다.
  - `Menu Product`는 `Product`를 갖는다.
  - `Menu Product`는 `Quantity`를 갖는다.
- `Menu`는 메뉴의 공개 상태를 표현하는 `Menu Displayed`를 갖는다.

#### 행위
- `Menu`를 등록한다.
- `Menu`의 `Menu Price`를 변경한다.
- `Menu`의 공개 상태를 `공개`로 변경한다.
- `Menu`의 공개 상태를 `비공개`로 변경한다.
- `Menu` 목록을 조회한다.

#### 정책
##### `Menu` 등록
- `Menu`는 하나 이상의 `Menu Group`에 속해 있어야 한다.
- `Menu Product`를 1개 이상 가지고 있어야 한다.
- `Menu Name`은 공백이 될 수 없다.
- `Menu Name`은 `Profanity`를 포함 할 수 없다.
- `Menu Price`는 0 이상 이어야 한다.
- `Menu Price`는 `Menu Product`의 가격(`상품의 가격` * `상품의 수량`) 보다 같거나 낮아야 한다.

##### `Menu Price` 변경
- `Menu Price`는 `Menu Product`의 가격(`상품의 가격` * `상품의 수량`) 보다 같거나 낮아야 한다.

##### `Menu`의 공개 상태를 `공개`로 변경
- `Menu Price`가 `Menu Product`의 가격(`상품의 가격` * `상품의 수량`)이 높은 경우 `Menu`를 `공개`로 변경하지 않는다.


### 주문 테이블

#### 속성
- `Order Table`은 식별자를 갖는다.
- `Order Table`은 `Order Table Name`을 갖는다.
- `Order Table`은 주문 테이블을 사용하는 손님의 수를 나타내는 `Number of Guests`를 갖는다.
- `Order Table`은 테이블의 점유 여부를 나타내는 `Order Table Status`를 갖는다. 

#### 행위
- `Order Table`을 등록한다.
- `Order Table`의 `Order Table Status`를 `Occupied`로 설정한다.
- `Order Table`의 `Order Table Status`를 `Not Occupied`로 설정한다.
- `Order Table`의 `Number of Guests`를 변경한다.
- `Order Table`의 목록을 조회한다.

#### 정책 
- `Order Table`의 `Order Table Name`은 공백이 될 수 없다.
- `Order Table`의 `Order Table Status`를 `Not Occupied`로 설정하려면 `Order`의 `Order Status`가 `Completed` 이어야 한다.
- `Order Table`의 `Number Of Guests`는 0 이상 이어야 한다.
- `Order Table`의 `Order Table Status`가 `Occupied`일 경우에만 `Number of Guests`를 변경 할 수 있다.

### 주문
#### 속성
- `Order`는 식별자를 갖는다.
- `Order`는 주문 타입을 구별 할 수 있는 한 가지의 `Order Type`을 갖는다.
  - 매장 주문은 `Eat In Order` 포장 주문은 `Take Out Order` 배달 주문은 `Delivery Order`
- `Order`는 `Order Status`를 갖는다.
  - 대기는 `Waiting`
  - 접수는 `Accepted`
  - 음식 제공됨은 `Served`
  - 배달중은 `Delivering`
  - 배달완료는 `Delivered`
  - 완료는 `Completed`
- `Order`는 `Order Date Time`을 갖는다.
- `Order`는 `Order Line Item`를 갖는다.
  - `Order Line Item`은 식별자를 갖는다.
  - `Order Line Item`은 `Menu`를 갖는다.
  - `Order Line Item`은 `Quantity`를 갖는다.
  - `Order Line Item`은 `Price`를 갖는다.

#### 행위
- `Order`를 등록한다.
- `Order`를 `Accepted` 한다.
- `Order`를 `Served` 한다.
- `Order`를 `Complete` 한다.
- `Order` 목록을 조회한다.

#### 정책
- `Order Line Item`을 1개 이상 가지고 있어야 한다.
- `Order Line Item`의 `Price`와 `Menu Price`가 같아야 한다.
- 생성된 `Order`의 `Order Status`는 `Waiting`이어야 한다.
- 생성된 `Order`의 `Order Date Time`은 `Order` 생성 요청을 한 `시간` 이여야 한다.

### 매장 주문
#### 속성
- `매장 주문`은 `Order Table`을 갖는다.

#### 행위
- `손님`이 `매장 주문`을 등록한다.
- `사장님`이 `매장 주문`을 접수한다.
- `사장님`이 `손님`에게 음식을 제공한다.
- `사장님`이 `매장 주문`을 완료한다.

#### 정책
- `매장 주문`의 `Order Status`는 `Waiting`, `Accepted`, `Served`, `Completed`의 순서를 갖는다.
- `매장 주문`의 `Order Status`가 `Completed`이 되었다면 `Order Table`의 `Number of Guests`를 0명으로 설정하며, `Order Table Status`를 `Not Occupied`로 설정한다.
- `매장 주문`의 `Order Line Item`의 `Quantity`는 음수를 허용한다.

### 포장 주문
#### 행위
- `손님`이 `포장 주문`을 등록한다.
- `사장님`이 `포장 주문`을 접수한다.
- `사장님`이 `손님`에게 음식을 제공한다.
- `사장님`이 `포장 주문`을 완료한다.

#### 정책
- `포장 주문`의 `Order Status`는 `Waiting`, `Accepted`, `Served`, `Completed`의 순서를 갖는다.
- `포장 주문`의 `Order Line Item`의 `Quantity`는 0개 이상이어야 한다.

### 배달 주문
#### 속성
- `배달 주문`은 `Delivery Address`를 갖는다.

#### 행위
- `손님`이 `배달 주문`을 요청한다.
- `사장님`이 `배달 주문`을 접수한다.
  - `배달 대행사`가 `라이더`를 배정한다.
- `사장님`이 `라이더`에게 `음식을 제공`한다.
- `라이더`가 `배달을 시작`한다.
- `라이더`가 `배달을 완료`한다.
- `사장님`이 `배달 주문`을 완료한다.

#### 정책
- `배달 주문`의 `Order Status`는 `Waiting`, `Accepted`, `Served`, `Delivering`, `Delivered`, `Completed`의 순서를 갖는다.
- `배달 주문`의 `Delivery Address`는 공백이 될 수 없다.
- `배달 주문`의 `Order Line Item`의 `Quantity`는 0개 이상이어야 한다.
