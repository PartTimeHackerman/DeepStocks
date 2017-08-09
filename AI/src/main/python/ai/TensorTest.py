import tensorflow as tf


# node1 = tf.constant(3.0, tf.float32)
# node2 = tf.constant(4.0)
# print(node1, node2)
#

# print(sess.run([node1, node2]))
#
# node3 = tf.add(node1, node2)
# print("node3: ", node3)
# print(sess.run(node3))
#
# a = tf.placeholder(tf.float32)
# b = tf.placeholder(tf.float32)
# adder_node = tf.add(a, b)
# print(sess.run(adder_node, {a: 3, b: 4.5}))
# print(sess.run(adder_node, {a: [1, 3], b: [2, 4]}))
#
# add_and_triple = tf.multiply(adder_node, 3)
# print(sess.run(add_and_triple, {a: 3, b: 4.5}))


def variable_summaries(var):
    """Attach a lot of summaries toClass a Tensor (for TensorBoard visualization)."""
    with tf.name_scope('summaries'):
        mean = tf.reduce_mean(var)
        tf.summary.scalar('mean', mean)
        with tf.name_scope('stddev'):
            stddev = tf.sqrt(tf.reduce_mean(tf.square(var - mean)))
        tf.summary.scalar('stddev', stddev)
        tf.summary.scalar('max', tf.reduce_max(var))
        tf.summary.scalar('min', tf.reduce_min(var))
        tf.summary.histogram('histogram', var)


sess = tf.Session()
W = tf.Variable([.3], tf.float32, name="weight")  # theta1 (weight)
b = tf.Variable([-.3], tf.float32, name="bias")  # theta0 (bias)
x = tf.placeholder(tf.float32, name="x")
linearRegressionHipotesis = b + W * x
init = tf.global_variables_initializer()
sess.run(init)

xArr = [1, 2, 3, 4]
yArr = [2, 4, 6, 8]

print(sess.run(linearRegressionHipotesis, {x: xArr}))

y = tf.placeholder(tf.float32, name="y")
squared_deltas = tf.square(linearRegressionHipotesis - y)
costFunc = tf.reduce_sum(squared_deltas)

data = {x: xArr, y: yArr}

print(sess.run(costFunc, data))

optimizer = tf.train.GradientDescentOptimizer(0.01)
train = optimizer.minimize(costFunc)

print(sess.run([b, W]))
sess.run(init)
for i in range(1000):
    sess.run(train, data)

print(sess.run([b, W]))
print(sess.run(costFunc, data))

merged = tf.summary.merge_all()
train_writer = tf.summary.FileWriter('./logs', sess.graph)
train_writer.add_summary(sess.run(init))

train_writer.close()
