require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Start
        q!: $regex</start>
        a: Бастайық

    state: Hello
        intent!: /hello
        random:
            a: Сәлеметсіз бе!
            a: salam 
            a: kal kalay
        state: HelloHello
            intent!: /hello
            random:
                a: amannin artygi jok
                a: biz amandastik koi ne kerek edi

    state: Bye
        intent!: /bye
        a: сау бол!

    state: NoMatch
        event!: noMatch
        a: Мен түсінбедім. Сен не дедің: {{$request.query}}