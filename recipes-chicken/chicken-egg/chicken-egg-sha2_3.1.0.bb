SECTION = "devel/chicken"
DESCRIPTION = "Computes 256-, 385- and 512-bit SHA2 checksums"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://sha2.meta;md5=957a5fa34ef821d91d4a7549df68aacc"
DEPENDS_append_class-cross = " chicken-egg-message-digest-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-message-digest-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-message-digest chicken-egg-message-digest-crosssdk"
DEPENDS = " chicken-egg-message-digest chicken-egg-message-digest-cross"
RDEPENDS_${PN} = " chicken-egg-message-digest"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/sha2/sha2-${PV}.tar.gz"

SRC_URI[md5sum] = "a1feac8a9001ac57e4bafcd8e4c8401c"
SRC_URI[sha256sum] = "854af2522e3270d8d7079b68c330bda6da947a0c20b2cd741ed539fdd319d8fd"

S = "${WORKDIR}/sha2-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
