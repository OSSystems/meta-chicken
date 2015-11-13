SECTION = "devel/chicken"
DESCRIPTION = "Mail retrieval via the POP3 protocol"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://pop3.meta;md5=be0b586707b6577d43ef9edd7ba5b885"
DEPENDS_append_class-cross = " chicken-egg-matchable-cross chicken-egg-regex-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-matchable-crosssdk chicken-egg-regex-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-matchable nativesdk-chicken-egg-regex chicken-egg-matchable-crosssdk chicken-egg-regex-crosssdk"
DEPENDS = " chicken-egg-matchable chicken-egg-regex chicken-egg-matchable-cross chicken-egg-regex-cross"
RDEPENDS_${PN} = " chicken-egg-matchable chicken-egg-regex"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/pop3/pop3-${PV}.tar.gz"

SRC_URI[md5sum] = "f6b009b9a4d5bede3e2f5e7952caf751"
SRC_URI[sha256sum] = "345b709b4de835eb161fad06816fda09be51bb6a83bd7481ae20652f15339759"

S = "${WORKDIR}/pop3-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
