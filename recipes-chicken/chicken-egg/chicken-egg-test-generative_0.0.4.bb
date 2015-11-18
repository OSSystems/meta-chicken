SECTION = "devel/chicken"
DESCRIPTION = "Allows quickcheck like testing for pure code with the test egg"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://test-generative.meta;md5=e98020c5dd02b953181af31499087118"
DEPENDS_append_class-cross = " chicken-egg-test-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-test-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-test chicken-egg-test-crosssdk"
DEPENDS = " chicken-egg-test chicken-egg-test-cross"
RDEPENDS_${PN} = " chicken-egg-test"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/test-generative/test-generative-${PV}.tar.gz"

SRC_URI[md5sum] = "6bf4a495d35ba2b5ea855a2db5663daf"
SRC_URI[sha256sum] = "a17f9b00f71ce0a65d8f6a7c76571ba412a6541a6352454a7e52ee7bfece49a9"

S = "${WORKDIR}/test-generative-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
