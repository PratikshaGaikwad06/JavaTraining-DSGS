// // Define the Vue component
const MyComponent = {
  // data: {
  //   counter: 0, // If we don’t do that, all instances will be sharing the same object and
                  //  every time we change something, it will be reflected in all instances.
  // },
  data() {
    return {
      counter: 0,
    };
  },
  template: `
      <div>
        <h2>Counter: {{ counter }}</h2>
        <button @click="increment">Increment</button>
      </div>
    `,
  methods: {
    increment() {
      this.counter++;
    },
  },
};

// Create Vue application instances
const app1 = Vue.createApp(MyComponent);
const app2 = Vue.createApp(MyComponent);

// Mount the instances to the corresponding HTML elements
app1.mount("#app1");
app2.mount("#app2");
