SECTION = "devel/chicken"
DESCRIPTION = "The SipHash family of hash functions"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://siphash.meta;md5=81c999501bf0043c95c70dbaebd74bda"
DEPENDS_append_class-cross = " chicken-egg-numbers-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-numbers-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-numbers chicken-egg-numbers-crosssdk"
DEPENDS = " chicken-egg-numbers chicken-egg-numbers-cross"
RDEPENDS_${PN} = " chicken-egg-numbers"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/siphash/siphash-${PV}.tar.gz"

SRC_URI[md5sum] = "a1700a607b67ecb3301bef86dda61eb3"
SRC_URI[sha256sum] = "dfd8c91db407a75e4f0f358a4faa792b0c4232cfff7fabb036e41ab407b8931a"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
