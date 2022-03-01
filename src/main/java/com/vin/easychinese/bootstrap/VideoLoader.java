package com.vin.easychinese.bootstrap;

import org.springframework.boot.CommandLineRunner;

//@Component
public class VideoLoader implements CommandLineRunner {
//    public final VideoInfoRepository videoInfoRepository;
//
//    public VideoLoader(VideoInfoRepository videoInfoRepository) {
//        this.videoInfoRepository = videoInfoRepository;
//    }

    @Override
    public void run(String... args) throws Exception {
        loadVideos();
    }

    private void loadVideos() {
//        if (videoInfoRepository.count() == 0) {
//            videoInfoRepository.save(
//                    VideoInfo.builder()
//                            .id(100000L)
//                            .title("Trình độ HSK 1 và HSK 2")
//                            .description("[Luyện nghe tiếng trung 1] Chủ đề mua sắm | Học tiếng trung cùng Sophia\n" +
//                                    "Chương trình tự học tiếng trung cho người mới bắt đầu.\n" +
//                                    "#luyệnnghetiếngtrung #luyệnngheHSK1 #luyệnngheHSK2 #tiếngtrunggiản thể #họctiếngtrungcùngsophia")
//                            .urlLink("https://www.youtube.com/watch?v=W5-T66P_gjM")
//                            .build()
//            );
//            videoInfoRepository.save(
//                    VideoInfo.builder()
//                            .id(100001L)
//                            .title("[HSK 1- Tiếng trung giao tiếp] Bài 4: Bạn đi đâu đấy? | Học tiếng trung cùng Sophia")
//                            .urlLink("https://www.youtube.com/watch?v=CDL2oVMPpmI")
//                            .description("[HSK 1- Tiếng trung giao tiếp] Bài 4: Bạn đi đâu đấy? | Học tiếng trung cùng Sophia\n" +
//                                    "Đây là chương trình tự học tiếng trung cho người mới bắt đầu.\n" +
//                                    "Hôm nay, Sophia tiếp tục chia sẻ đến các bạn nội dung bài học số 4 trong chương trình Tiếng Trung giao tiếp cho người mới bắt đầu. \n" +
//                                    "Trong bài học này, các bạn sẽ được làm quen thêm với các mẫu câu thông dụng trong giao tiếp. \n" +
//                                    "Nếu các bạn thấy đây là 1 video hữu ích, thì đừng tiếc gì cho Sophia xin 1 LIKE-SHARE-SUBCRIBE để Sophia có thêm động lực làm tiếp các video chia sẻ với các bạn nhé! :))")
//                            .build()
//            );
//            System.out.println("Sample Video Loaded");
//        }
    }
}