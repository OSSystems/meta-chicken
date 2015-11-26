SECTION = "devel/chicken"
DESCRIPTION = "An enhancement for srfi-18 that connects a mailbox to each thread."
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://mailbox-threads.meta;md5=09358c9a7d6af658c74c7dafff3cab7c"
DEPENDS_append_class-cross = " chicken-egg-mailbox-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-mailbox-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-mailbox chicken-egg-mailbox-crosssdk"
DEPENDS = " chicken-egg-mailbox chicken-egg-mailbox-cross"
RDEPENDS_${PN} = " chicken-egg-mailbox"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/mailbox-threads/mailbox-threads-${PV}.tar.gz"

SRC_URI[md5sum] = "608cc476d9e25597a5c4d860b656c58b"
SRC_URI[sha256sum] = "490db54f0ea55126347636bcadc6f760f011c25f6d2216a2f0acc87a059896f4"

S = "${WORKDIR}/mailbox-threads-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
