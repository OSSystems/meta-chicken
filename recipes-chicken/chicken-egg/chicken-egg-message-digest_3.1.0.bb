SECTION = "devel/chicken"
DESCRIPTION = "Message Digest Support"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://message-digest.meta;md5=2acf61404c236ac9c498a3b96b99734e"
DEPENDS_append_class-cross = " chicken-egg-setup-helper-cross chicken-egg-miscmacros-cross chicken-egg-check-errors-cross chicken-egg-variable-item-cross chicken-egg-blob-utils-cross chicken-egg-string-utils-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-setup-helper-crosssdk chicken-egg-miscmacros-crosssdk chicken-egg-check-errors-crosssdk chicken-egg-variable-item-crosssdk chicken-egg-blob-utils-crosssdk chicken-egg-string-utils-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-setup-helper nativesdk-chicken-egg-miscmacros nativesdk-chicken-egg-check-errors nativesdk-chicken-egg-variable-item nativesdk-chicken-egg-blob-utils nativesdk-chicken-egg-string-utils chicken-egg-setup-helper-crosssdk chicken-egg-miscmacros-crosssdk chicken-egg-check-errors-crosssdk chicken-egg-variable-item-crosssdk chicken-egg-blob-utils-crosssdk chicken-egg-string-utils-crosssdk"
DEPENDS = " chicken-egg-setup-helper chicken-egg-miscmacros chicken-egg-check-errors chicken-egg-variable-item chicken-egg-blob-utils chicken-egg-string-utils chicken-egg-setup-helper-cross chicken-egg-miscmacros-cross chicken-egg-check-errors-cross chicken-egg-variable-item-cross chicken-egg-blob-utils-cross chicken-egg-string-utils-cross chicken-egg-message-digest-cross"
RDEPENDS_${PN} = " chicken-egg-setup-helper chicken-egg-miscmacros chicken-egg-check-errors chicken-egg-variable-item chicken-egg-blob-utils chicken-egg-string-utils"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "c430dcbaf4cc671dfdb2090501c11196"
SRC_URI[sha256sum] = "d0986b8bb4dff0a61ec685e8b17d557ade2fca61298f1ce27c138bc8e7d8408e"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
