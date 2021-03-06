/**
 * FileName: CommandDecoder
 * Author:   HuangTaiHong
 * Date:     2019/1/2 19:30
 * Description: Decode command.
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package roberto.group.process.netty.practice.command.codec;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈Decode command.〉
 *
 * @author HuangTaiHong
 * @create 2019/1/2
 * @since 1.0.0
 */
public interface CommandDecoder {
    /**
     * 功能描述: <br>
     * 〈Decode bytes into object.〉
     *
     * @param ctx
     * @param in
     * @param out
     * @throws Exception
     * @author HuangTaiHong
     * @date 2019.01.02 19:31:27
     */
    void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) throws Exception;
}